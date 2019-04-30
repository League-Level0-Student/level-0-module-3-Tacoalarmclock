 int x1=250;
 int x2=1250;
 int speed = 1;
void setup() {
  size (1500, 750);
  noStroke();
}

void draw() {
  background(200,205,195);
  for (int i = 405; i > 1; i = i-7) {
    x1 += speed;
    x2 -= speed;
    fill(195,15,50);
    if (i % 3 == 0||i % 4 == 0){
    fill(255,0,0);
    }
    ellipse(x1,375,i,i);
    ellipse(x2,375,i,i);
    if (x1 > 1500){
    speed = -1;
    }
    if (x1 < 0){
    speed = 1;
    }
  }
  delay(00);
}