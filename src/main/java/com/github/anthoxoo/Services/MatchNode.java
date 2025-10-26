package com.github.anthoxoo.Services;
import com.github.anthoxoo.Classes.Match;

public class MatchNode {
    private final Match match;
    private MatchNode left;
    private MatchNode right;

    // constructor
    public MatchNode(Match match) { this.match = match; }

    //getters
    public MatchNode getLeft() { return left; }
    public Match getMatch() { return match; }
    public MatchNode getRight() { return right; }

    // setters
    public void setLeft(MatchNode leftNode) { this.left = leftNode; }
    public void setRight(MatchNode rightNode) { this.right = rightNode; }

    // Methods
    public boolean isLeaf() { return this.left == null && this.right == null; }
}

