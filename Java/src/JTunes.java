import javazoom.jl.player.advanced.AdvancedPlayer;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

class MP3PlayerWithPlaylist extends JFrame 
{
    private DefaultListModel<String> playlistModel;
    private JList<String> playlist;
    private ArrayList<File> songs;
    private JButton playButton, stopButton, addButton, removeButton;
    private JLabel trackInfoLabel; 
    private PlayerThread playerThread;
    private int currentSongIndex = -1;

    public MP3PlayerWithPlaylist()

    {
        setTitle("JTunes");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font customFont = new Font("Arial", Font.BOLD, 13);
        UIManager.put("Label.font", customFont);
        UIManager.put("Button.font", customFont);
        UIManager.put("List.font", customFont);

        // Custom background panel
        BackgroundPanel backgroundPanel = new BackgroundPanel("src\\JTUNES BACKGROUND.png");
        backgroundPanel.setLayout(new BorderLayout());
        setContentPane(backgroundPanel);

        // Initialize playlist model and list
        playlistModel = new DefaultListModel<>();
        playlist = new JList<>(playlistModel);
        playlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        playlist.setOpaque(false);
        playlist.setCellRenderer(new TransparentListCellRenderer());

        JScrollPane playlistScroll = new JScrollPane(playlist);
        playlistScroll.setOpaque(false);
        playlistScroll.getViewport().setOpaque(false);

        // Initialize song file list
        songs = new ArrayList<>();
        addDefaultSongs();

        // Add buttons for playlist management
        JPanel controlsPanel = new JPanel(new FlowLayout());
        controlsPanel.setOpaque(false);
        addButton = new JButton("Add Song");
        removeButton = new JButton("Remove Song");
        playButton = new JButton("Play");
        stopButton = new JButton("Stop");

        controlsPanel.add(addButton);
        controlsPanel.add(removeButton);
        controlsPanel.add(playButton);
        controlsPanel.add(stopButton);

        // Track info panel
        JPanel trackInfoPanel = new JPanel();
        trackInfoPanel.setOpaque(false);
        trackInfoLabel = new JLabel("No track playing", SwingConstants.CENTER);
        trackInfoLabel.setFont(new Font("Arial", Font.BOLD, 18));
        trackInfoLabel.setForeground(Color.WHITE);
        trackInfoPanel.add(trackInfoLabel);

        // Add components to the frame
        backgroundPanel.add(playlistScroll, BorderLayout.CENTER);
        backgroundPanel.add(controlsPanel, BorderLayout.SOUTH);
        backgroundPanel.add(trackInfoPanel, BorderLayout.NORTH);

        // Button actions
        addButton.addActionListener(e -> addSong());
        removeButton.addActionListener(e -> removeSong());
        playButton.addActionListener(e -> playSong());
        stopButton.addActionListener(e -> stopSong());

        setVisible(true);
    }

    // Add default songs to the playlist
    private void addDefaultSongs() {
        String[] defaultSongPaths = {
            "songs\\Arjunar Villu.mp3",
            "songs\\Bye-Bye-Bye.mp3",
            "songs\\Chammak Challo.mp3",
            "songs\\Damakku-Damakku.mp3",
            "songs\\Ella-Pugazhum.mp3",
            "songs\\Go Down.mp3",
            "songs\\Ithellam-Dupe.mp3",
            "songs\\Jagdish-On-Mission.mp3",
            "songs\\Kalasala-Kalasala.mp3",
            "songs\\Lungi Dance.mp3",
            "songs\\Orasaadha-Usurathan.mp3",
            "songs\\Palaanadhu-Palaanadhu.mp3",
            "songs\\Pistah.mp3",
            "songs\\Ringa Ringa.mp3",
            "songs\\Tauba Tauba.mp3",

        };

        for (String path : defaultSongPaths) {
            File songFile = new File(path);
            if (songFile.exists()) {
                songs.add(songFile);
                playlistModel.addElement(songFile.getName());
            }
        }
    }

    // Add a song to the playlist
    private void addSong() 
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("MP3 Files", "mp3"));
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            songs.add(selectedFile);
            playlistModel.addElement(selectedFile.getName());
        }
    }

    // Remove a song from the playlist
    private void removeSong() 
    {
        int selectedIndex = playlist.getSelectedIndex();
        if (selectedIndex != -1) 
        {
            songs.remove(selectedIndex);
            playlistModel.remove(selectedIndex);
            if (currentSongIndex == selectedIndex) 
            {
                stopSong();
                trackInfoLabel.setText("No track playing");
            }
        }
    }

    // Play the selected song
    private void playSong() {
        int selectedIndex = playlist.getSelectedIndex();
        if (selectedIndex != -1 && (currentSongIndex != selectedIndex || playerThread == null || !playerThread.isPlaying()))
        {
            stopSong();
            currentSongIndex = selectedIndex;
            File songFile = songs.get(selectedIndex);
            trackInfoLabel.setText("Playing: " + songFile.getName());
            playerThread = new PlayerThread(songFile);
            playerThread.start();
        }
    }

    // Stop the current song
    private void stopSong() 
    {
        if (playerThread != null) 
        {
            playerThread.stopPlayback();
            playerThread = null;
        }
    }

    // Thread for playing MP3 files
    class PlayerThread extends Thread 
    {
        private File songFile;
        private AdvancedPlayer player;
        private boolean playing = false;

        public PlayerThread(File songFile) 
        {
            this.songFile = songFile;
        }

        public boolean isPlaying() 
        {
            return playing;
        }

        @Override
        public void run() 
        {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(songFile))) 
            {
                player = new AdvancedPlayer(bis);
                playing = true;
                player.play();
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(MP3PlayerWithPlaylist.this, "Error playing file: " + e.getMessage());
            } finally 
            {
                playing = false;
            }
        }

        public void stopPlayback() 
        {
            if (player != null) 
            {
                player.close();
                playing = false;
            }
        }
    }

    //JPanel for the background image
    class BackgroundPanel extends JPanel 
    {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) 
        {
            try 
            {
                backgroundImage = new ImageIcon(imagePath).getImage();
            } catch (Exception e) 
            {
                JOptionPane.showMessageDialog(MP3PlayerWithPlaylist.this, "Error loading background image: " + e.getMessage());
            }
        }

        @Override
        protected void paintComponent(Graphics g) 
        {
            super.paintComponent(g);
            if (backgroundImage != null) 
            {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    // Custom cell renderer for transparent playlist
    class TransparentListCellRenderer extends DefaultListCellRenderer 
    {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) 
        {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setOpaque(false);
            label.setForeground(isSelected ? Color.YELLOW : Color.WHITE);
            return label;
        }
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(MP3PlayerWithPlaylist::new);
    }
}
