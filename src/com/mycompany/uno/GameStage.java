/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uno;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;

public class GameStage extends javax.swing.JFrame {
    private AddPlayerNames addPlayers = new AddPlayerNames();
    ArrayList<String> temp = new ArrayList<>();
    String[] pids;
    Game game;
    ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    ArrayList<String> cardIds;
    PopUp window;

    public GameStage() {}

    public GameStage(ArrayList<String> playerIds) {
        initComponents();
        temp = playerIds;
        pids = temp.toArray(new String[temp.size()]);
        game = new Game(pids);
        populateArrayList();
        game.start(game);
        setPidName();
        topCardButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodas\\OneDrive\\Desktop\\sprites\\small\\" + game.getTopCardImage()));
        setButtonIcons();
    }

    public void setButtonIcons() {
        String listString = game.getPlayerHand(game.getCurrentPlayer()).stream().map(Object::toString).collect(Collectors.joining("."));
        String[] cardNames = listString.split("\\.");
        cardIds = new ArrayList<>(Arrays.asList(cardNames));
        for (int i = 0; i < cardIds.size(); i++) {
            cardButtons.get(i).setIcon(new javax.swing.ImageIcon("C:\\Users\\Rodas\\OneDrive\\Desktop\\sprites\\small\\" + cardIds.get(i) + ".png"));
        }
        for (int i = cardIds.size(); i < cardButtons.size(); i++) {
            cardButtons.get(i).setIcon(null);
        }
    }

    public void populateArrayList() {
        cardButtons.add(jButton1);
        cardButtons.add(jButton2);
        cardButtons.add(jButton3);
        cardButtons.add(jButton4);
        cardButtons.add(jButton5);
        cardButtons.add(jButton6);
        cardButtons.add(jButton7);
        cardButtons.add(jButton8);
        cardButtons.add(jButton9);
        cardButtons.add(jButton10);
        cardButtons.add(jButton11);
        cardButtons.add(jButton12);
        cardButtons.add(jButton13);
        cardButtons.add(jButton14);
        cardButtons.add(jButton15);
    }

    public void setPidName() {
        String currentPlayer = game.getCurrentPlayer();
        pidNameLabel.setText(currentPlayer + "'s Cards");
    }

    public void setPidName(String currentPlayer) {
        pidNameLabel.setText(currentPlayer + "'s Cards");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        drawCardButton = new javax.swing.JButton();
        topCardButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pidNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uno");
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        drawCardButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36));
        drawCardButton.setText("Draw Card");
        drawCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardButtonActionPerformed(evt);
            }
        });

        topCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topCardButtonActionPerformed(evt);
            }
        });

        pidNameLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        pidNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(118, 118, 118)
                                                                .addComponent(topCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(pidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(1004, 1004, 1004)
                                                        .addComponent(drawCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(topCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drawCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(pidNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(307, 307, 307))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(9) != null) {
            int index = 9;
            String cardId = cardIds.get(9);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void drawCardButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JLabel message = new JLabel(game.getCurrentPlayer() + " drew a card! ");
        message.setFont(new Font("Arial", Font.BOLD, 48));
        JOptionPane.showMessageDialog(null, message);
        try {
            game.submitDraw(game.getCurrentPlayer());
        } catch (InvalidPlayerTurnException ex) {
            Logger.getLogger(GameStage.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setPidName(game.getCurrentPlayer());
        this.setButtonIcons();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(0) != null) {
            int index = 0;
            String cardId = cardIds.get(0);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(1) != null) {
            int index = 1;
            String cardId = cardIds.get(1);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(2) != null) {
            int index = 2;
            String cardId = cardIds.get(2);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(3) != null) {
            int index = 3;
            String cardId = cardIds.get(3);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(4) != null) {
            int index = 4;
            String cardId = cardIds.get(4);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(5) != null) {
            int index = 5;
            String cardId = cardIds.get(5);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(6) != null) {
            int index = 6;
            String cardId = cardIds.get(6);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(7) != null) {
            int index = 7;
            String cardId = cardIds.get(7);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(8) != null) {
            int index = 8;
            String cardId = cardIds.get(8);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(10) != null) {
            int index = 10;
            String cardId = cardIds.get(10);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(11) != null) {
            int index = 11;
            String cardId = cardIds.get(11);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(12) != null) {
            int index = 12;
            String cardId = cardIds.get(12);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(13) != null) {
            int index = 13;
            String cardId = cardIds.get(13);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        if (cardIds.get(14) != null) {
            int index = 14;
            String cardId = cardIds.get(14);
            window = new PopUp(cardId, game, index, cardButtons, this, topCardButton);
            window.setBounds(750, 40, 700, 800);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void topCardButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameStage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameStage().setVisible(true);
            }
        });
    }

    private javax.swing.JButton drawCardButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pidNameLabel;
    private javax.swing.JButton topCardButton;
}




