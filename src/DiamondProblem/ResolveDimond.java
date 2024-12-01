package DiamondProblem;

interface BlockA{
     default void display(){
        System.out.println("Block A");
    }
}

interface BlockB{
    default void display(){
        System.out.println("Block B");
    }
}


public class ResolveDimond implements BlockA, BlockB {
    // Must resolve the conflict between A's and B's display()
    public void display() {
        BlockA.super.display(); // Explicitly call A's version

//  In this case, class ResolveDimond implements both A and B and resolves any ambiguity by explicitly choosing which method to use.
    }
}


