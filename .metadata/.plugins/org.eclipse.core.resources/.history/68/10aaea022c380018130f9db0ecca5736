from PIL import Image
num = "8"
newNum = "8"

fil = ["A", "B", "D", "E", "W1", "W2"]

for filN in fil:
	picture = Image.open(filN+"_"+num+".png")
	width, height = picture.size
	for x in range(width):
		for y in range(height):
			current_color = picture.getpixel( (x,y) )
			if current_color == (126, 99, 73, 255):
				picture.putpixel( (x,y), (214, 207, 99, 255))	
	picture.save(filN+"_"+newNum+".png")
	picture.close()

