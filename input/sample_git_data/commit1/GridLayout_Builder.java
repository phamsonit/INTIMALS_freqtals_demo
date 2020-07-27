package builder;

import builder.Builder;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Component;

public class GridLayout_Builder implements Builder {
        private JPanel m_panel = new JPanel();
		Map<String,String> obj = new HashMap();

        public void set_width_and_height(int width, int height) {
            m_panel.setLayout(new GridLayout(height, width));
            m_panel.setBackground(Color.white);
        }

        public void start_row() {
	        Iterator<Map.Entry<String, String>> itr = obj.entrySet().iterator(); 
			while(itr.hasNext()){
				Map.Entry<String, String> entry = itr.next(); 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 				
			}			
        }

        public void build_cell(String value) {
            m_panel.add(new Label(value));
	        Iterator<Map.Entry<String, String>> itr = obj.entrySet().iterator(); 
			while(itr.hasNext()){
				Map.Entry<String, String> entry = itr.next(); 
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 				
			}			
        }

        public Component get_result() {
            return m_panel;
        }
    }
