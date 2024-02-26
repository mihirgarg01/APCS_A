// package Unit8Project;

// import images.APImage;
// import images.Pixel;
// import java.util.Scanner;

// public class Manipulator {
//     public void blackWhite(String imageName) {
//         APImage image = new APImage("./src/" + imageName);

//         for (Pixel p : image) {
//             int red = p.getRed();
//             int green = p.getGreen();
//             int blue = p.getBlue();

//             int average = (red + green + blue) / 3;

//             if (average < 128) {
//                 p.setRed(0);
//                 p.setGreen(0);
//                 p.setBlue(0);
//             } else {
//                 p.setRed(255);
//                 p.setGreen(255);
//                 p.setBlue(255);
//             }
//         }
//         image.draw();
//     }

//     public void greyscale(String imageName) {
//         APImage image = new APImage("./src/" + imageName);

//         for (Pixel p : image) {
//             int red = p.getRed();
//             int green = p.getGreen();
//             int blue = p.getBlue();

//             int average = (red + green + blue) / 3;

//             p.setRed(average);
//             p.setGreen(average);
//             p.setBlue(average);
//         }
//         image.draw();
//     }

//     public void luminanceGreyscale(String imageName) {
//         APImage image = new APImage("./src/" + imageName);
//         image.draw();

//         for (Pixel p : image) {
//             int red = p.getRed();
//             int green = p.getGreen();
//             int blue = p.getBlue();

//             int average = (int) (((red * 0.299) + (green * .587) + (blue * .114)) / 3);

//             p.setRed(average);
//             p.setGreen(average);
//             p.setBlue(average);
//         }
//         image.draw();
//     }

//     public void rotateImage(String imageName) {
//         APImage original = new APImage("./src/" + imageName);
//         int width = original.getWidth();
//         int height = original.getHeight();
//         APImage clone = new APImage(height, width);

//         for (int y = 0; y < height; y++) {
//             for (int x = 0; x < width; x++) {
//                 Pixel originalPixel = original.getPixel(x, y);

//                 clone.setPixel(height - 1 - y, x, originalPixel);
//             }
//         }

//         clone.draw();
//     }
// }
