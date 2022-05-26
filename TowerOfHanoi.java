class TowerOfHanoi {
 
  public static void main(String[] args) {
    board(3, 'A', 'B', 'C');
  }
 
  private static void board(int n, char startingPeg, char auxiliaryPeg, 
  char targetPeg){
 
 
    if(n==1){
    
      System.out.println("Move disk 1 from "+startingPeg+" to "+targetPeg);
      return;
    }
 
    board(n-1,startingPeg,targetPeg,auxiliaryPeg);
 
    System.out.println("Move disk "+n+" from "+startingPeg+" to "+targetPeg);
 
    board(n-1,auxiliaryPeg,startingPeg,targetPeg);
    
  }
}
