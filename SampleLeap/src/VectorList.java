
import java.util.ArrayList;

import com.leapmotion.leap.Vector;

public class VectorList {
    
	private ArrayList<Vector> myList = new ArrayList<Vector>();
	
	public VectorList(ArrayList<Vector> v) {
		myList = v;
	}
	
	public void setVectorList(ArrayList<Vector> v) {
		myList = v;
	}
	
	public ArrayList<Vector> getFingerRatio() {
		ArrayList<Vector> v = new ArrayList<Vector>();
		Vector x = new Vector(0, 0, 0);
		v.add(x = new Vector(
			((myList.get(1).getX() - myList.get(0).getX()) / (myList.get(2).getX() - myList.get(1).getX())), 
			((myList.get(1).getY() - myList.get(0).getY()) / (myList.get(2).getY() - myList.get(1).getY())),
			((myList.get(1).getZ() - myList.get(0).getZ()) / (myList.get(2).getZ() - myList.get(1).getZ()))));
		v.add(x = new Vector(
			((myList.get(2).getX() - myList.get(1).getX()) / (myList.get(3).getX() - myList.get(2).getX())), 
			((myList.get(2).getY() - myList.get(1).getY()) / (myList.get(3).getY() - myList.get(2).getY())),
			((myList.get(2).getZ() - myList.get(1).getZ()) / (myList.get(3).getZ() - myList.get(2).getZ()))));
		v.add(x = new Vector(
			((myList.get(3).getX() - myList.get(2).getX()) / (myList.get(4).getX() - myList.get(3).getX())), 
			((myList.get(3).getY() - myList.get(2).getY()) / (myList.get(4).getY() - myList.get(3).getY())),
			((myList.get(3).getZ() - myList.get(2).getZ()) / (myList.get(4).getZ() - myList.get(3).getZ()))));
		v.add(x = new Vector(
			((myList.get(5).getX() - myList.get(4).getX()) / (myList.get(6).getX() - myList.get(5).getX())), 
			((myList.get(5).getY() - myList.get(4).getY()) / (myList.get(6).getY() - myList.get(5).getY())),
			((myList.get(5).getZ() - myList.get(4).getZ()) / (myList.get(6).getZ() - myList.get(5).getZ()))));
		v.add(x = new Vector(
			((myList.get(6).getX() - myList.get(5).getX()) / (myList.get(7).getX() - myList.get(6).getX())), 
			((myList.get(6).getY() - myList.get(5).getY()) / (myList.get(7).getY() - myList.get(6).getY())),
			((myList.get(6).getZ() - myList.get(5).getZ()) / (myList.get(7).getZ() - myList.get(6).getZ()))));
		v.add(x = new Vector(
			((myList.get(7).getX() - myList.get(6).getX()) / (myList.get(8).getX() - myList.get(7).getX())), 
			((myList.get(7).getY() - myList.get(6).getY()) / (myList.get(8).getY() - myList.get(7).getY())),
			((myList.get(7).getZ() - myList.get(6).getZ()) / (myList.get(8).getZ() - myList.get(7).getZ()))));
		v.add(x = new Vector(
			((myList.get(9).getX() - myList.get(8).getX()) / (myList.get(10).getX() - myList.get(9).getX())), 
			((myList.get(9).getY() - myList.get(8).getY()) / (myList.get(10).getY() - myList.get(9).getY())),
			((myList.get(9).getZ() - myList.get(8).getZ()) / (myList.get(10).getZ() - myList.get(9).getZ()))));
		v.add(x = new Vector(
			((myList.get(10).getX() - myList.get(9).getX()) / (myList.get(11).getX() - myList.get(10).getX())), 
			((myList.get(10).getY() - myList.get(9).getY()) / (myList.get(11).getY() - myList.get(10).getY())),
			((myList.get(10).getZ() - myList.get(9).getZ()) / (myList.get(11).getZ() - myList.get(10).getZ()))));
		v.add(x = new Vector(
			((myList.get(11).getX() - myList.get(10).getX()) / (myList.get(12).getX() - myList.get(11).getX())), 
			((myList.get(11).getY() - myList.get(10).getY()) / (myList.get(12).getY() - myList.get(11).getY())),
			((myList.get(11).getZ() - myList.get(10).getZ()) / (myList.get(12).getZ() - myList.get(11).getZ()))));
		v.add(x = new Vector(
			((myList.get(13).getX() - myList.get(12).getX()) / (myList.get(14).getX() - myList.get(13).getX())), 
			((myList.get(13).getY() - myList.get(12).getY()) / (myList.get(14).getY() - myList.get(13).getY())),
			((myList.get(13).getZ() - myList.get(12).getZ()) / (myList.get(14).getZ() - myList.get(13).getZ()))));
		v.add(x = new Vector(
			((myList.get(14).getX() - myList.get(13).getX()) / (myList.get(15).getX() - myList.get(14).getX())), 
			((myList.get(14).getY() - myList.get(13).getY()) / (myList.get(15).getY() - myList.get(14).getY())),
			((myList.get(14).getZ() - myList.get(13).getZ()) / (myList.get(15).getZ() - myList.get(14).getZ()))));
		v.add(x = new Vector(
			((myList.get(15).getX() - myList.get(14).getX()) / (myList.get(16).getX() - myList.get(15).getX())), 
			((myList.get(15).getY() - myList.get(14).getY()) / (myList.get(16).getY() - myList.get(15).getY())),
			((myList.get(15).getZ() - myList.get(14).getZ()) / (myList.get(16).getZ() - myList.get(15).getZ()))));
		v.add(x = new Vector(
			((myList.get(17).getX() - myList.get(16).getX()) / (myList.get(18).getX() - myList.get(17).getX())), 
			((myList.get(17).getY() - myList.get(16).getY()) / (myList.get(18).getY() - myList.get(17).getY())),
			((myList.get(17).getZ() - myList.get(16).getZ()) / (myList.get(18).getZ() - myList.get(17).getZ()))));
		v.add(x = new Vector(
			((myList.get(18).getX() - myList.get(17).getX()) / (myList.get(19).getX() - myList.get(18).getX())), 
			((myList.get(18).getY() - myList.get(17).getY()) / (myList.get(19).getY() - myList.get(18).getY())),
			((myList.get(18).getZ() - myList.get(17).getZ()) / (myList.get(19).getZ() - myList.get(18).getZ()))));
		v.add(x = new Vector(
			((myList.get(19).getX() - myList.get(18).getX()) / (myList.get(20).getX() - myList.get(19).getX())), 
			((myList.get(19).getY() - myList.get(18).getY()) / (myList.get(20).getY() - myList.get(19).getY())),
			((myList.get(19).getZ() - myList.get(18).getZ()) / (myList.get(20).getZ() - myList.get(19).getZ()))));	
		return v;
	}
	
    public boolean compareVectorList(VectorList v) {
    	VectorList a = new VectorList(myList);
    	for(int i = 0; i < myList.size(); i++) {
    		if(Math.abs(a.getFingerRatio().get(i).getX()) >= Math.abs(v.getFingerRatio().get(i).getX()) + 0.5) {
    			return false;
    		}
    	}
    	for(int i = 0; i < myList.size(); i++) {
    		if(Math.abs(a.getFingerRatio().get(i).getY()) >= Math.abs(v.getFingerRatio().get(i).getY()) + 0.5) {
    			return false;
    		}
    	}
    	for(int i = 0; i < myList.size(); i++) {
    		if(Math.abs(a.getFingerRatio().get(i).getZ()) >= Math.abs(v.getFingerRatio().get(i).getZ()) + 0.5) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
