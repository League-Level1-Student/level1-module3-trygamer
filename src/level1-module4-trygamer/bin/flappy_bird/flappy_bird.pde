void setup(){
  size(1000,1000);
  
}

void draw(){
  
  background(0, 255, 0);
  fill(255,0 , 0);
stroke(0, 0, 0);

for(int i=0;i<500;i++){
  
ellipse(500, 500+i, 100, 100);
}
}