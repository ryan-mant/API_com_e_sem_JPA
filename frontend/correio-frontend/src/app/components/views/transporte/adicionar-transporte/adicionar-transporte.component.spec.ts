import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarTransporteComponent } from './adicionar-transporte.component';

describe('AdicionarTransporteComponent', () => {
  let component: AdicionarTransporteComponent;
  let fixture: ComponentFixture<AdicionarTransporteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarTransporteComponent]
    });
    fixture = TestBed.createComponent(AdicionarTransporteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
