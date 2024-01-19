package javaadvancecalculator;



import java.util.Stack;

/**
 *
 * @author Harman
 */
public class NewJFrame extends javax.swing.JFrame{

    public String exp="",ans="",show="";
    private Stack <Double> operands=new Stack<>();
    private Stack <Character> operations=new Stack<>();
    
    
    public NewJFrame() {
        initComponents();
       
    }
    private double calculator(String exp){
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
            //check integer 0-9
            if(Character.isDigit(ch)){
                double num = 0;
                 while (Character.isDigit(ch))
                 {
                           num = num*10.0 + (ch-'0');
                           i++;
                         if(i < exp.length())
                         {
                             ch = exp.charAt(i);
                         }
                         else
                         {
                             break;
                         }
                 }
                i--;
                operands.push(num);
            }
          //check brackets 
           else if(ch=='('){
                operations.push(ch);   
            }
         //check brackets 
           else if(ch==')'){   
                while(operations.peek()!='(')
             {
                     double output = performOperation(operands, operations);
                     operands.push(output);   //push result back to stack
             }
             operations.pop();   
            }
           else if(isOperator(ch)){
             while(!operations.isEmpty() && precedence(ch)<=precedence(operations.peek())){
                     
                 double output = performOperation(operands, operations);
                     operands.push(output);   //push result back to stack
             }
               operations.push(ch);   //push the current operator to stack
         }
        }
   while(!operations.isEmpty())
     {
        double output = performOperation(operands, operations);
         operands.push(output);   //push final result back to stack
     }
     return operands.pop(); 
    }
    //check precedence
    static int precedence(char c){
                
        switch (c){
                     case '+':
                         return 0;
                     case '-':
                         return 1;
                     case '*':
                         return 2;
                     case '/':
                         return 3;
                     case '^':
                         return 4;
                 }
                 return -1;
        }
     public double performOperation(Stack<Double> operands, Stack<Character> operations){
        char operation = operations.pop();
         if(operation=='+'||operation=='-'||operation=='*'||operation=='/'||operation=='^'||operation=='+'){
         double a = operands.pop();
         double b = operands.pop();
         
         switch (operation){
             case '+' -> {
                 return a + b;
            }
             case '-' -> {
                 return b - a;
            }
             case '*' -> {
                 return a * b;
            }
             case '^' -> {
                 return Math.pow(a,b);
            }
             case '/' -> {
                 if (a == 0.0){
                     System.out.println("Cannot divide by zero");
                     return 0.0;
                 }
                 return b / a;
            }
         }
         
         }
         else{
         double a = operands.pop();
         switch (operation){
            
            case '!' -> {
                 return fact(a);
            }
            case 'l' -> {
                 return Math.log10(a);
            }
            case 's' -> {
                 return Math.sin(a);
            }
            case 'c' -> {
                 return Math.cos(a);
            }
            case 't' -> {
                 return Math.tan(a);
            }
            case 'n' -> {
                 return Math.log(a);
            }
            case 'd' -> {
                 return Math.toDegrees(a);
            }
            case 'r' -> {
                 return Math.toRadians(a);
            }
            case 'a' -> {
                 return Math.asin(a);
            }
            case 'b' -> {
                 return Math.acos(a);
            }
            case 'e' -> {
                 return Math.atan(a);
            }
            case 'h' -> {
                 return Math.pow(a,10);
            }
            case 'q' -> {
                System.out.println("hi");
                 return Math.sqrt(a);
            }
            
             
         }
         }
         return 0.0;
    }
     //check operator
    public boolean isOperator(char c){
        
         return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^'
                 ||c=='!'||c=='q'||c=='h'||c=='e'||c=='b'
                 ||c=='a'||c=='r'||c=='d'||c=='n'||c=='t'
                 ||c=='c'||c=='s'||c=='l');
    }
    public double fact(double a){
        int f=1;
        while(a>0){
            f*=a;
            a--;
        }
        return f;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
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
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced Calculator by Harman");
        setLocation(new java.awt.Point(450, 180));
        setMaximumSize(new java.awt.Dimension(639, 432));
        setMinimumSize(new java.awt.Dimension(639, 432));
        setPreferredSize(new java.awt.Dimension(639, 455));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(639, 432));
        jPanel1.setMinimumSize(new java.awt.Dimension(639, 432));
        jPanel1.setPreferredSize(new java.awt.Dimension(639, 428));

        jPanel2.setBackground(new java.awt.Color(113, 108, 108));
        jPanel2.setMaximumSize(new java.awt.Dimension(581, 387));
        jPanel2.setMinimumSize(new java.awt.Dimension(581, 387));
        jPanel2.setPreferredSize(new java.awt.Dimension(581, 387));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setMaximumSize(new java.awt.Dimension(567, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(567, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(567, 100));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(java.awt.Color.darkGray);
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFocusCycleRoot(true);
        jPanel4.setFocusTraversalPolicyProvider(true);
        jPanel4.setMaximumSize(new java.awt.Dimension(567, 257));
        jPanel4.setMinimumSize(new java.awt.Dimension(567, 257));
        jPanel4.setPreferredSize(new java.awt.Dimension(567, 257));

        jButton1.setBackground(java.awt.Color.darkGray);
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("(");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setDoubleBuffered(true);
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setIconTextGap(0);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton1.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton1.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Deg");
        jButton2.setActionCommand("(");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setDoubleBuffered(true);
        jButton2.setFocusCycleRoot(true);
        jButton2.setFocusTraversalPolicyProvider(true);
        jButton2.setIconTextGap(0);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton2.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton2.setOpaque(false);
        jButton2.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.darkGray);
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("sin");
        jButton3.setActionCommand("(");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setDoubleBuffered(true);
        jButton3.setFocusCycleRoot(true);
        jButton3.setFocusTraversalPolicyProvider(true);
        jButton3.setIconTextGap(0);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton3.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton3.setOpaque(false);
        jButton3.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.darkGray);
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("sin-1");
        jButton4.setActionCommand("(");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setDoubleBuffered(true);
        jButton4.setFocusCycleRoot(true);
        jButton4.setFocusTraversalPolicyProvider(true);
        jButton4.setIconTextGap(0);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton4.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton4.setOpaque(false);
        jButton4.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton5.setBackground(java.awt.Color.darkGray);
        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("n!");
        jButton5.setActionCommand("(");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setDoubleBuffered(true);
        jButton5.setFocusCycleRoot(true);
        jButton5.setFocusTraversalPolicyProvider(true);
        jButton5.setIconTextGap(0);
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton5.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton5.setOpaque(false);
        jButton5.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(java.awt.Color.darkGray);
        jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText(")");
        jButton6.setActionCommand("(");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setDoubleBuffered(true);
        jButton6.setFocusCycleRoot(true);
        jButton6.setFocusTraversalPolicyProvider(true);
        jButton6.setIconTextGap(0);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton6.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton6.setOpaque(false);
        jButton6.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.Color.darkGray);
        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Rad");
        jButton7.setActionCommand("(");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setDoubleBuffered(true);
        jButton7.setFocusCycleRoot(true);
        jButton7.setFocusTraversalPolicyProvider(true);
        jButton7.setIconTextGap(0);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton7.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton7.setOpaque(false);
        jButton7.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(java.awt.Color.darkGray);
        jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("cos");
        jButton8.setActionCommand("(");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setDoubleBuffered(true);
        jButton8.setFocusCycleRoot(true);
        jButton8.setFocusTraversalPolicyProvider(true);
        jButton8.setIconTextGap(0);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton8.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton8.setOpaque(false);
        jButton8.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.darkGray);
        jButton9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("cos-1");
        jButton9.setActionCommand("(");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setDoubleBuffered(true);
        jButton9.setFocusCycleRoot(true);
        jButton9.setFocusTraversalPolicyProvider(true);
        jButton9.setIconTextGap(0);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton9.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton9.setOpaque(false);
        jButton9.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(java.awt.Color.darkGray);
        jButton10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("x2");
        jButton10.setActionCommand("(");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setDoubleBuffered(true);
        jButton10.setFocusCycleRoot(true);
        jButton10.setFocusTraversalPolicyProvider(true);
        jButton10.setIconTextGap(0);
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton10.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton10.setOpaque(false);
        jButton10.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(java.awt.Color.darkGray);
        jButton11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("exp");
        jButton11.setActionCommand("(");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setDoubleBuffered(true);
        jButton11.setFocusCycleRoot(true);
        jButton11.setFocusTraversalPolicyProvider(true);
        jButton11.setIconTextGap(0);
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton11.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton11.setOpaque(false);
        jButton11.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton12.setBackground(java.awt.Color.darkGray);
        jButton12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("x3");
        jButton12.setActionCommand("(");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setDoubleBuffered(true);
        jButton12.setFocusCycleRoot(true);
        jButton12.setFocusTraversalPolicyProvider(true);
        jButton12.setIconTextGap(0);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton12.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton12.setOpaque(false);
        jButton12.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(java.awt.Color.darkGray);
        jButton13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("tan");
        jButton13.setActionCommand("(");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setDoubleBuffered(true);
        jButton13.setFocusCycleRoot(true);
        jButton13.setFocusTraversalPolicyProvider(true);
        jButton13.setIconTextGap(0);
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton13.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton13.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton13.setOpaque(false);
        jButton13.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(java.awt.Color.darkGray);
        jButton14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("tan-1");
        jButton14.setActionCommand("(");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setDoubleBuffered(true);
        jButton14.setFocusCycleRoot(true);
        jButton14.setFocusTraversalPolicyProvider(true);
        jButton14.setIconTextGap(0);
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton14.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton14.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton14.setOpaque(false);
        jButton14.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(java.awt.Color.darkGray);
        jButton15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("x^y");
        jButton15.setActionCommand("(");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setDoubleBuffered(true);
        jButton15.setFocusCycleRoot(true);
        jButton15.setFocusTraversalPolicyProvider(true);
        jButton15.setIconTextGap(0);
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton15.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton15.setOpaque(false);
        jButton15.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(java.awt.Color.darkGray);
        jButton16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("pie");
        jButton16.setActionCommand("(");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setDoubleBuffered(true);
        jButton16.setFocusCycleRoot(true);
        jButton16.setFocusTraversalPolicyProvider(true);
        jButton16.setIconTextGap(0);
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton16.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton16.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton16.setOpaque(false);
        jButton16.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(java.awt.Color.darkGray);
        jButton17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("abs");
        jButton17.setActionCommand("(");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setDoubleBuffered(true);
        jButton17.setFocusCycleRoot(true);
        jButton17.setFocusTraversalPolicyProvider(true);
        jButton17.setIconTextGap(0);
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton17.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton17.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton17.setOpaque(false);
        jButton17.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton18.setBackground(java.awt.Color.darkGray);
        jButton18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("log");
        jButton18.setActionCommand("(");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setDoubleBuffered(true);
        jButton18.setFocusCycleRoot(true);
        jButton18.setFocusTraversalPolicyProvider(true);
        jButton18.setIconTextGap(0);
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton18.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton18.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton18.setOpaque(false);
        jButton18.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(java.awt.Color.darkGray);
        jButton19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("ln");
        jButton19.setActionCommand("(");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setDoubleBuffered(true);
        jButton19.setFocusCycleRoot(true);
        jButton19.setFocusTraversalPolicyProvider(true);
        jButton19.setIconTextGap(0);
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton19.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton19.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton19.setOpaque(false);
        jButton19.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(java.awt.Color.darkGray);
        jButton20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton20.setForeground(java.awt.Color.green);
        jButton20.setText("Ans");
        jButton20.setActionCommand("(");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setDoubleBuffered(true);
        jButton20.setFocusCycleRoot(true);
        jButton20.setFocusTraversalPolicyProvider(true);
        jButton20.setIconTextGap(0);
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton20.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton20.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton20.setOpaque(false);
        jButton20.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(java.awt.Color.orange);
        jButton21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton21.setForeground(java.awt.Color.red);
        jButton21.setText("C");
        jButton21.setActionCommand("(");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setDoubleBuffered(true);
        jButton21.setFocusCycleRoot(true);
        jButton21.setFocusTraversalPolicyProvider(true);
        jButton21.setIconTextGap(0);
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton21.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton21.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton21.setOpaque(false);
        jButton21.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(java.awt.Color.blue);
        jButton22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("7");
        jButton22.setActionCommand("(");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setDoubleBuffered(true);
        jButton22.setFocusCycleRoot(true);
        jButton22.setFocusTraversalPolicyProvider(true);
        jButton22.setIconTextGap(0);
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton22.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton22.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton22.setOpaque(false);
        jButton22.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(java.awt.Color.blue);
        jButton23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("4");
        jButton23.setActionCommand("(");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setDoubleBuffered(true);
        jButton23.setFocusCycleRoot(true);
        jButton23.setFocusTraversalPolicyProvider(true);
        jButton23.setIconTextGap(0);
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton23.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton23.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton23.setOpaque(false);
        jButton23.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(java.awt.Color.blue);
        jButton24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("1");
        jButton24.setActionCommand("(");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setDoubleBuffered(true);
        jButton24.setFocusCycleRoot(true);
        jButton24.setFocusTraversalPolicyProvider(true);
        jButton24.setIconTextGap(0);
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton24.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton24.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton24.setOpaque(false);
        jButton24.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(java.awt.Color.darkGray);
        jButton25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("10^x");
        jButton25.setActionCommand("(");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setDoubleBuffered(true);
        jButton25.setFocusCycleRoot(true);
        jButton25.setFocusTraversalPolicyProvider(true);
        jButton25.setIconTextGap(0);
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton25.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton25.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton25.setOpaque(false);
        jButton25.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(java.awt.Color.red);
        jButton26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("del");
        jButton26.setActionCommand("(");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setDoubleBuffered(true);
        jButton26.setFocusCycleRoot(true);
        jButton26.setFocusTraversalPolicyProvider(true);
        jButton26.setIconTextGap(0);
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton26.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton26.setOpaque(false);
        jButton26.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(java.awt.Color.blue);
        jButton27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("8");
        jButton27.setActionCommand("(");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setDoubleBuffered(true);
        jButton27.setFocusCycleRoot(true);
        jButton27.setFocusTraversalPolicyProvider(true);
        jButton27.setIconTextGap(0);
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton27.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton27.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton27.setOpaque(false);
        jButton27.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(java.awt.Color.blue);
        jButton28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("5");
        jButton28.setActionCommand("(");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setDoubleBuffered(true);
        jButton28.setFocusCycleRoot(true);
        jButton28.setFocusTraversalPolicyProvider(true);
        jButton28.setIconTextGap(0);
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton28.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton28.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton28.setOpaque(false);
        jButton28.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(java.awt.Color.blue);
        jButton29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("2");
        jButton29.setActionCommand("(");
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        jButton29.setDoubleBuffered(true);
        jButton29.setFocusCycleRoot(true);
        jButton29.setFocusTraversalPolicyProvider(true);
        jButton29.setIconTextGap(0);
        jButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton29.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton29.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton29.setOpaque(false);
        jButton29.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(java.awt.Color.blue);
        jButton30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("0");
        jButton30.setActionCommand("(");
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jButton30.setDoubleBuffered(true);
        jButton30.setFocusCycleRoot(true);
        jButton30.setFocusTraversalPolicyProvider(true);
        jButton30.setIconTextGap(0);
        jButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton30.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton30.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton30.setOpaque(false);
        jButton30.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(java.awt.Color.darkGray);
        jButton31.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("+/-");
        jButton31.setActionCommand("(");
        jButton31.setBorder(null);
        jButton31.setBorderPainted(false);
        jButton31.setDoubleBuffered(true);
        jButton31.setFocusCycleRoot(true);
        jButton31.setFocusTraversalPolicyProvider(true);
        jButton31.setIconTextGap(0);
        jButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton31.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton31.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton31.setOpaque(false);
        jButton31.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(java.awt.Color.blue);
        jButton32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("9");
        jButton32.setActionCommand("(");
        jButton32.setBorder(null);
        jButton32.setBorderPainted(false);
        jButton32.setDoubleBuffered(true);
        jButton32.setFocusCycleRoot(true);
        jButton32.setFocusTraversalPolicyProvider(true);
        jButton32.setIconTextGap(0);
        jButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton32.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton32.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton32.setOpaque(false);
        jButton32.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(java.awt.Color.blue);
        jButton33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("6");
        jButton33.setActionCommand("(");
        jButton33.setBorder(null);
        jButton33.setBorderPainted(false);
        jButton33.setDoubleBuffered(true);
        jButton33.setFocusCycleRoot(true);
        jButton33.setFocusTraversalPolicyProvider(true);
        jButton33.setIconTextGap(0);
        jButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton33.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton33.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton33.setOpaque(false);
        jButton33.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(java.awt.Color.blue);
        jButton34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("3");
        jButton34.setActionCommand("(");
        jButton34.setBorder(null);
        jButton34.setBorderPainted(false);
        jButton34.setDoubleBuffered(true);
        jButton34.setFocusCycleRoot(true);
        jButton34.setFocusTraversalPolicyProvider(true);
        jButton34.setIconTextGap(0);
        jButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton34.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton34.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton34.setOpaque(false);
        jButton34.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(java.awt.Color.darkGray);
        jButton35.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("=");
        jButton35.setActionCommand("(");
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        jButton35.setDoubleBuffered(true);
        jButton35.setFocusCycleRoot(true);
        jButton35.setFocusTraversalPolicyProvider(true);
        jButton35.setIconTextGap(0);
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton35.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton35.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton35.setOpaque(false);
        jButton35.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(java.awt.Color.darkGray);
        jButton36.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("/");
        jButton36.setActionCommand("(");
        jButton36.setBorder(null);
        jButton36.setBorderPainted(false);
        jButton36.setDoubleBuffered(true);
        jButton36.setFocusCycleRoot(true);
        jButton36.setFocusTraversalPolicyProvider(true);
        jButton36.setIconTextGap(0);
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton36.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton36.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton36.setOpaque(false);
        jButton36.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setBackground(java.awt.Color.darkGray);
        jButton37.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setText("*");
        jButton37.setActionCommand("(");
        jButton37.setBorder(null);
        jButton37.setBorderPainted(false);
        jButton37.setDoubleBuffered(true);
        jButton37.setFocusCycleRoot(true);
        jButton37.setFocusTraversalPolicyProvider(true);
        jButton37.setIconTextGap(0);
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton37.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton37.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton37.setOpaque(false);
        jButton37.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(java.awt.Color.darkGray);
        jButton38.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("-");
        jButton38.setActionCommand("(");
        jButton38.setBorder(null);
        jButton38.setBorderPainted(false);
        jButton38.setDoubleBuffered(true);
        jButton38.setFocusCycleRoot(true);
        jButton38.setFocusTraversalPolicyProvider(true);
        jButton38.setIconTextGap(0);
        jButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton38.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton38.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton38.setOpaque(false);
        jButton38.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(java.awt.Color.darkGray);
        jButton39.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("+");
        jButton39.setActionCommand("(");
        jButton39.setBorder(null);
        jButton39.setBorderPainted(false);
        jButton39.setDoubleBuffered(true);
        jButton39.setFocusCycleRoot(true);
        jButton39.setFocusTraversalPolicyProvider(true);
        jButton39.setIconTextGap(0);
        jButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton39.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton39.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton39.setOpaque(false);
        jButton39.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(java.awt.Color.darkGray);
        jButton40.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText(".");
        jButton40.setActionCommand("(");
        jButton40.setBorder(null);
        jButton40.setBorderPainted(false);
        jButton40.setDoubleBuffered(true);
        jButton40.setFocusCycleRoot(true);
        jButton40.setFocusTraversalPolicyProvider(true);
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.setIconTextGap(0);
        jButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton40.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton40.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton40.setOpaque(false);
        jButton40.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton40.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton41.setBackground(java.awt.Color.darkGray);
        jButton41.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("sqrt");
        jButton41.setActionCommand("(");
        jButton41.setBorder(null);
        jButton41.setBorderPainted(false);
        jButton41.setDoubleBuffered(true);
        jButton41.setFocusCycleRoot(true);
        jButton41.setFocusTraversalPolicyProvider(true);
        jButton41.setIconTextGap(0);
        jButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton41.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton41.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton41.setOpaque(false);
        jButton41.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(java.awt.Color.darkGray);
        jButton42.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("MC");
        jButton42.setActionCommand("(");
        jButton42.setBorder(null);
        jButton42.setBorderPainted(false);
        jButton42.setDoubleBuffered(true);
        jButton42.setFocusCycleRoot(true);
        jButton42.setFocusTraversalPolicyProvider(true);
        jButton42.setIconTextGap(0);
        jButton42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton42.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton42.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton42.setOpaque(false);
        jButton42.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton43.setBackground(java.awt.Color.darkGray);
        jButton43.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setText("MR");
        jButton43.setActionCommand("(");
        jButton43.setBorder(null);
        jButton43.setBorderPainted(false);
        jButton43.setDoubleBuffered(true);
        jButton43.setFocusCycleRoot(true);
        jButton43.setFocusTraversalPolicyProvider(true);
        jButton43.setIconTextGap(0);
        jButton43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton43.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton43.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton43.setOpaque(false);
        jButton43.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton44.setBackground(java.awt.Color.darkGray);
        jButton44.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("M+");
        jButton44.setActionCommand("(");
        jButton44.setBorder(null);
        jButton44.setBorderPainted(false);
        jButton44.setDoubleBuffered(true);
        jButton44.setFocusCycleRoot(true);
        jButton44.setFocusTraversalPolicyProvider(true);
        jButton44.setIconTextGap(0);
        jButton44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton44.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton44.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton44.setOpaque(false);
        jButton44.setPreferredSize(new java.awt.Dimension(56, 43));

        jButton45.setBackground(java.awt.Color.darkGray);
        jButton45.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText(",");
        jButton45.setActionCommand("(");
        jButton45.setBorder(null);
        jButton45.setBorderPainted(false);
        jButton45.setDoubleBuffered(true);
        jButton45.setFocusCycleRoot(true);
        jButton45.setFocusTraversalPolicyProvider(true);
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setIconTextGap(0);
        jButton45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton45.setMaximumSize(new java.awt.Dimension(56, 43));
        jButton45.setMinimumSize(new java.awt.Dimension(56, 43));
        jButton45.setOpaque(false);
        jButton45.setPreferredSize(new java.awt.Dimension(56, 43));
        jButton45.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton45.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // +
        exp+="+";
        show+="+";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // -
        exp+="-";
        show+="-";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // *
        exp+="*";
        show+="*";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // /
        exp+="/";
        show+="/";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // =

        double answer=calculator(exp);
        ans=Double.toString(answer);
        jTextField2.setText(ans);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // 3
        
        exp+="3";
        show+="3";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // 6
        exp+="6";
        show+="6";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // 9
        exp+="9";
        show+="9";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // +/-
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // 0

        exp+="0";
        show+="0";
        jTextField1.setText(show);

    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // 2
        exp+="2";
        show+="2";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // 5
        exp+="5";
        show+="5";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // 8
        exp+="8";
        show+="8";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // del
        
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // 1
        exp+="1";
        show+="1";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // 4
        exp+="4";
        show+="4";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // 7
        exp+="7";
        show+="7";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // c
        exp="";
        ans="";
        show="";
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // ans
        double answer=calculator(exp);
        ans=Double.toString(answer);
        jTextField2.setText(ans);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // pie
        exp+="3.14";
        show+="3.14";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // x^3
        exp+="^3";
        show+="^3";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // )
        exp+=")";
        show+=")";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // sin
        exp+="s";
        show+="sin";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // (
            exp+="(";
        show+="(";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // ^
        exp+="^";
        show+="^";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // ^2
        exp+="^2";
        show+="^2";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // log
        exp+="l";
        show+="log";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // !
        exp+="!";
        show+="!";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // cos
        exp+="c";
        show+="cos";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // tan
        exp+="t";
        show+="tan";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // logn
        exp+="n";
        show+="logn";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // degree
        exp+="d";
        show+="degree";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // radians
        exp+="r";
        show+="radians";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // sqrt
        exp+="q";
        show+="√";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // cos-1
        exp+="b";
        show+=" cos−1 ";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // tan-1
        exp+="e";
        show+=" tan−1 ";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // x^10
        exp+="h";
        show+="^10";
        jTextField1.setText(show);
    }//GEN-LAST:event_jButton25ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

   
    
}
