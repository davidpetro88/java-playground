package br.com.test.integracao;

import org.hibernate.tool.hbm2ddl.SchemaExport;


public class CriaTabelas {
	public static void main(String[] args) {
		new SchemaExport(new CriadorDeSessao().getConfig())
				.create(true,true);

//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		new SchemaExport().setImportFiles("hibernate.cfg.xml");
	}
}
