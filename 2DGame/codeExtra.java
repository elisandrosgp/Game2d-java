public class codeExtra {
  
};

  
public void run() {

  double drawInterval = 1000000000 / FPS; // 0.01666 per seconds
  double nextDrawTime = System.nanoTime() + drawInterval;

  while (gameThread != null) {
  //long currentTime = System.nanoTime();
  // System.out.println("current time: "+currentTime);
  // long currentTime2 = System.currentTimeMillis();
  // System.out.println("o Jogo esta rodando");
  // 1 UPDATE: Update information such as character positions
  update();
  // 2 DRAW: draw the screen with the updated information
  repaint();

  try {
  double remainingTime = nextDrawTime - System.nanoTime();
  remainingTime = remainingTime / 1000000;

  if (remainingTime < 0) {
  remainingTime = 0;
  }

  Thread.sleep((long) remainingTime);

  nextDrawTime += drawInterval;

  } catch (InterruptedException e) {

  e.printStackTrace();
  }

  }

  }
