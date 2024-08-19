

public class LabelFrame extends JFrame 
{
   private final JLabel label1; // JLabel with just text
   private final JLabel label2; // JLabel constructed with text and icon
   private final JLabel label3; // JLabel with added text and icon

   // construtor LabelFrame adiciona JLabels para JFrame
   public LabelFrame()
   {
      super("Testing JLabel");
      setLayout(new FlowLayout()); // define layout do frame 

      // construtor JLabel com uma linha de argumento
      label1 = new JLabel("Label with text");
      label1.setToolTipText("This is label1");
      add(label1); // adiciona label1 para JFrame

      // construtor JLabel com string, icone e alinhamento deargumentos
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      label2 = new JLabel("Label with text and icon", bug, 
         SwingConstants.LEFT);
      label2.setToolTipText("This is label2");
      add(label2); // adiciona label2 no JFrame

      label3 = new JLabel(); //construtor JLabel sem argumentos
      label3.setText("Label with icon and text at bottom");
      label3.setIcon(bug); // adiciona icone para JLabel
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("This is label3");
      add(label3); // adiciona label3 para JFrame
   } 
} // encerra classe LabelFrame


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
