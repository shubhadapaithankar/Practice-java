package com.company.shapedecorator;

public class RedDecorator extends Decorator{

    public RedDecorator(Component component){
        super(component);
    }

   // @Override
    //public void setBorder() {

  //  }

    @Override
    public void draw(){
        component.draw();
        setRedBorder(component);

    }


    public void setRedBorder(Component component) {
        System.out.println("Border colour: Red");

    }

}
