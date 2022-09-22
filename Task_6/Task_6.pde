void setup() {
   size(400, 400);
   background(255);
}

int patternColor = 255;
void draw() {
   for (int y = 0; y < width; y += 50) {
      for (int x = 0; x < height; x += 50) {
         fill(patternColor);
         rect(x, y, 50, 50);

         if (patternColor == 255) {
            patternColor = 0;
         }
         else {
            patternColor = 255;
         } 
      }

      if (patternColor == 0) {
         patternColor = 255;
      }
      else {
         patternColor = 0;
      }
   }
}
