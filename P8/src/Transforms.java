// P8
// Author: Ivory L Brallier
// Date:   10/18/2019
// Class:  CS164
// Email:  brallier@rams.colostate.edu

public class Transforms implements ImageInterface
{
	//Declare instance variables
	PictureLibrary pl = null;
	int imageWidth = 0;
	int imageHeight = 0;
	int[][] imageData;
	
	//Create Constructor
	public Transforms()
	{
        //Instantiate PictureLibrary object
		pl = new PictureLibrary();
    }

	
	//Methods take in image data
	public void readImage(String inFile) 
	{
		try 
		{
	        // Calls to readPGM or writePGM and associated code here
			pl.readPGM(inFile);
			imageHeight = pl.getHeight();
			imageWidth = pl.getWidth();
			imageData = pl.getData();
	    } catch (Exception e) 
		{
	        System.out.println(e.getMessage());
	    }
	}

	@Override
	public void writeImage(String outFile) 
	{
		try {
	        // Calls to readPGM or writePGM and associated code here
			pl.setData(imageData);
			pl.writePGM(outFile);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

	@Override
	public int[][] imageData() 
	{
		return imageData;
	}

	//TEST LATER?
	//Methods that transform the image
	public void decode() 
	{
		for(int i = 0; i < imageHeight; i++) 
		{
			for(int j = 0; j < imageWidth; j++) 
			{
				//Create upper and lower bit variables
				int upper = 0;
				int lower = 0;
				int newPixel;
				upper = imageData[i][j] / 16;
				lower = imageData[i][j] % 16;
				//Negate upper values
				upper = 15 - upper;
				//put back together
				newPixel = (upper * 16) + lower;
				
			}
		}
	}

	@Override
	public void swap() 
	{
		for(int i = 0; i < imageHeight; i++) 
		{
			for(int j = 0; j < imageWidth; j++) 
			{
				
			}
		}
	}

	@Override
	public void mirror() 
	{	
		for(int i = 0; i < imageHeight; i++) 
		{
			for(int j = 0; j < imageWidth; j++) 
			{
				
			}
		}
	}

	@Override
	public void exchange() 
	{
		for(int i = 0; i < imageHeight; i++) 
		{
			for(int j = 0; j < imageWidth; j++) 
			{
				
			}
		}
	}

}
