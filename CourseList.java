
package college_system;



    class Nodecourse{
        
        int courseId;
        Nodestudent enrolledStudent;//list of enrolled students
        Nodecourse next;
        int studentCount;//track number of students
        
        public Nodecourse(int courseId){
            
            this.courseId =courseId;
            this.enrolledStudent =null;
            this.next =null;
            this.studentCount=0;
        }
    }
    class CourseList {
        
        Nodecourse head;
        
        public Nodecourse searchCourse(int courseId) {
            Nodecourse current = head;
            while (current != null) {
                if (current.courseId == courseId)   return current; // Found
                current = current.next; // Move to next node
            }
            return null;       // Not found after traversing entire list
        }
        
        
        public void addcourse(int id){
            Nodecourse newnode=new Nodecourse(id);
            if(head==null){
                head=newnode;
            }
            else{
                Nodecourse current =head;
                while (current.next !=null)
                    current =current.next;                
                current.next=newnode;
            }
        }
        
        
        public void removecourse(int id){
            if (head.courseId ==id) {
                head =head.next;
            }
            Nodecourse current =head;
            while (current.next !=null) {
                if (current.next.courseId==id) {
                    current.next =current.next.next;//the node was deleted
                    return;
                }
                current=current.next;
            }

        }
        
        
        public int lastcourse(){
            Nodecourse current =head;
            while (current.next !=null) {
                current=current.next;
            }return current.courseId;
        }
    }



