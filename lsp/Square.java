package com.solid.lsp;

public class Square extends Shapes {
  private int side;

  public void setSide(int side) {
    this.side = side;
  }

  Square(int side) {
    this.setSide(side);
  }

  // @Override
  // public void setWidth(int width) {this.setSide(width);
  // }

  // @Override
  // public void setHeight(int height) {
  //     this.setSide(height);
  // }

  // public void setSide(int side) {
  //     super.setWidth(side);
  //     super.setHeight(side);
  // }

  @Override
  public int getArea() {
    return side * side;
  }
}
