package test;

import java.util.EnumSet;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

public class CreateDB {

	public static void main(String[] args) {
		
		
		/**	�ײ����ͨ��
		 
	     //��������ע�����
       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
       //�����Ự��������
       sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
       //�Ự����
       session = sessionFactory.openSession();
       //��������
       transaction = session.beginTransaction();
       **/
		
	
		Configuration config = new Configuration().configure();
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure().build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .buildMetadata();
        SchemaExport schemaExport = new SchemaExport();
        schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);

		
		
		
	}
	
}
