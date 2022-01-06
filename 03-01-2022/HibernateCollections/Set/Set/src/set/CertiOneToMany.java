package set;

import set.CertiOneToMany;

public class CertiOneToMany {
	
	   private int id;
	   private String name; 

	   public CertiOneToMany() {}
	   
	   public CertiOneToMany(String name) {
	      this.name = name;
	   }
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName( String name ) {
	      this.name = name;
	   }
	   
	   public boolean equals(Object obj) {
	      if (obj == null) return false;
	      if (!this.getClass().equals(obj.getClass())) return false;

	      CertiOneToMany obj2 = (CertiOneToMany)obj;
	      if((this.id == obj2.getId()) && (this.name.equals(obj2.getName()))) {
	         return true;
	      }
	      return false;
	   }
	   
	   public int hashCode() {
	      int tmp = 0;
	      tmp = ( id + name ).hashCode();
	      return tmp;
	   }
	}
