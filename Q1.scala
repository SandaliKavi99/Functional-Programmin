case class Point(a:Int, b:Int){

    def x:Int = a
    def y:Int = b

    def add(p:Point)= Point(this.x + p.x , this.y + p.y)
    
    def move(dx:Int,dy:Int)= Point(this.x + dx , this.y + dy)

    def distance(p:Point)= Point(this.x-p.x, this.y-p.y)

    def invert = Point(this.y, this.x)
    
 }



object Q1 extends App{

  var p1 =Point(2,5)
  var p2=Point(1,4)

  printf("\n\np1 point : ")
  print(p1.x,p1.y)

  printf("\n\np2 point : ")
  print(p2.x,p2.y)

  var p3 =p1.add(p2)
  printf("\n\nNew Point (Addition of p1 and p2) : ")
  print(p3.x, p3.y)
  
  
  var p4 = p1.move(2,5)
  printf("\n\nNew point after Moving p1 point : ")
   print(p4.x, p4.y)

   var p5 = p1.distance(p2)
    printf("\n\nDistance between p1 point and p2 point : ")
    print("x= "+p5.x+", y= "+p5.y)

   var p6 = p1.invert
    printf("\n\nInvertation of p1 point : ")
    print(p6.x,p6.y)
    print("\n\n")

 


}