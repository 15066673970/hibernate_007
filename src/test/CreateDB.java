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
		
		
		/**	亲测可以通过
		 
	     //创建服务注册对象
       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
       //创建会话工厂对象
       sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
       //会话对象
       session = sessionFactory.openSession();
       //开启事务
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
