package builder;

import builder.Builder;

import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Component;

public class GridBagLayout_Builder implements Builder {
        private JPanel m_panel = new JPanel();
        private GridBagConstraints c = new GridBagConstraints();
        private int x = 0, y = 0;
		private boolean DEBUG = true;
		
        public void set_width_and_height(int width, int height) {
            m_panel.setLayout(new GridBagLayout());
            m_panel.setBackground(Color.white);
        }

        public void start_row() {
			//inserted code to new version
			if(DEBUG)
				System.out.println("start now");
            x = 0;
            ++y;
			//keep in new version
			while(x < y) ++y;
			//old for instance
			for(int i=1; i<x; i++)
				System.out.print(y+i);						
        }

        public void build_cell(String value) {
			//inserted code to new version
			if(!DEBUG)
				System.out.println("build cell");
            c.gridx = x++;
            c.gridy = y;
            m_panel.add(new Label(value), c);
			//insert 1 instance
			for(int i=1; i<x; i++)
				System.out.print(y+i);			
        }

        public Component get_result() {
            return m_panel;
        }
    }