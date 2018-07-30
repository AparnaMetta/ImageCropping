import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;

public class CropAnImage {

 public static BufferedImage getScreenshotforObjects(String imageName, String objectname, int x, int y, int width,
                                                     int height) {
  try {
   BufferedImage full = ImageIO
           .read(new File("C:\\Users\\E004001\\Desktop\\Asus\\" + imageName + ".png"));
   BufferedImage cropped = cropforObjects(full, x, y, width - x, height - y);
   ImageIO.write(cropped, "png",
           new File("C:\\Users\\E004001\\Desktop\\ccAsus\\" + objectname + ".png"));
   Dimension size = new Dimension(full.getWidth(), full.getHeight());
   return cropped;
  } catch (IOException e) {
  }
  return null;
 }

 private static BufferedImage cropforObjects(BufferedImage src, int x, int y, int width, int height) {
  BufferedImage dest = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
  Graphics graphics = dest.getGraphics();
  graphics.drawImage(src, 0, 0, width, height, x, y, x + width, y + height, null);
  graphics.dispose();
  return dest;

 }

 public static void main(String[] args) {


//Batman

  getScreenshotforObjects("A", "BatmanCarRed", 36, 183, 634, 469);
  /*
  getScreenshotforObjects("A", "BatmanCarBlue",652,185,1245,469);
  getScreenshotforObjects("B", "BatmanCarBlueBackIcon",39,43,160,153);
  getScreenshotforObjects("B", "BatmanCarBlueHubConnectivityIcon",178,44,300,148);
  getScreenshotforObjects("B", "BatmanCarBlueMinusIconLeft",56,503,236,658);
  getScreenshotforObjects("B", "BatmanCarBlueMinusIconRight",1055,506,1224,655);
  getScreenshotforObjects("B", "BatmanCarBluePlusIconLeft",63,244,232,390);
  getScreenshotforObjects("B", "BatmanCarBluePlusIconRight",1053,244,1220,390);

  getScreenshotforObjects("11", "BatmanCarRedBackIcon",36,45,160,115);
  getScreenshotforObjects("11", "BatmanCarRedHubConnectivityIcon",182,42,298,145);
  getScreenshotforObjects("11", "BatmanCarRedDownArrowIconLeft",36,622,107,671);
  getScreenshotforObjects("11", "BatmanCarRedDownArrowIconRight",1155,619,1221,668);
  getScreenshotforObjects("11", "BatmanCarRedDownArrowLimitLeft",36,622,159,675);
  getScreenshotforObjects("11", "BatmanCarRedDownArrowLimitRight",1108,616,1221,668);
  getScreenshotforObjects("11", "BatmanCarRedStopIconLeft",25,403,209,458);
  getScreenshotforObjects("11", "BatmanCarRedStopIconRight",1053,398,1232,453;
  getScreenshotforObjects("11", "BatmanCarRedUpArrowIconLeft",40,187,107,234);
  getScreenshotforObjects("11", "BatmanCarRedUpArrowIconRight",1153,184,1223,234);
  getScreenshotforObjects("11", "BatmanCarRedUpArrowLimitLeft",40,187,157,232);
  getScreenshotforObjects("11", "BatmanCarRedUpArrowLimitRight",1109,184,1223,234);


  //TrainGame

  getScreenshotforObjects("T1", "ElectricTrainBackIcon",37, 44, 160, 151);
  getScreenshotforObjects("T1", "ElectricTrainHubConnectivityIcon",175, 42, 301, 145);
  getScreenshotforObjects("T1", "ElectricTrainPlusIcon",79,227 ,232 ,367 );
  getScreenshotforObjects("T1", "ElectricTrainStopIcon",78,386,229,473 );
  getScreenshotforObjects("T1", "ElectricTrainMinusIcon",75,493, 226,637 );
  getScreenshotforObjects("T1", "ElectricTrainGameArea",287,194,588,578);
  getScreenshotforObjects("T1", "ElectricTrainSpeedZero",309,419,558,572 );
  getScreenshotforObjects("T2", "ElectricTrainMinSpeed",319,419,554,572 );
  getScreenshotforObjects("T4", "ElectricTrainMaxSpeed",312,420 ,555,571 );
  getScreenshotforObjects("T3", "ElectricTrainMinSpeedReverse",313,421 ,555,571 );
  getScreenshotforObjects("T5","ElectricTrainMaxSpeedReverse",314,421,555,571 );
  getScreenshotforObjects("T3", "ElectricTrainMinSpeedReverse",313,421 ,555,571 );
  getScreenshotforObjects("T5","ElectricTrainMaxSpeedReverse",314,421,555,571 );

  getScreenshotforObjects("LO","Batman",348,173,633,544 );
  getScreenshotforObjects("H", "GameAreaHelpSectionFirstScreen",264,259,608,480 );
  getScreenshotforObjects("H", "GameAreaNext",1031,538, 1102,605 );


  getScreenshotforObjects("C", "CargoTrainBackIcon",37, 44, 156, 151);
  getScreenshotforObjects("T1", "CargoTrainHubConnectivityIcon",179, 44, 294, 141);
  getScreenshotforObjects("T1", "CargoTrainPlusIcon",80,221 ,229 ,365 );
  getScreenshotforObjects("T1", "CargoTrainStopIcon",79,389,233, 472 );
  getScreenshotforObjects("T1", "CargoTrainMinusIcon",78,497, 230,643 );
  getScreenshotforObjects("T1", "CargoTrainGameArea",289,194,581,581);
  getScreenshotforObjects("T1", "CargoTrainSpeedZero",310,420,557,575 );
  getScreenshotforObjects("C1", "CargoTrainMinSpeed",310,420,557,575 );
  getScreenshotforObjects("C2", "CargoTrainMaxSpeed",310,420,557,575  );
  getScreenshotforObjects("C3", "CargoTrainMinSpeedReverse",310,420,557,575 );
  getScreenshotforObjects("C4","CargoTrainMaxSpeedReverse",310,420,557,575 );


*/

 }

}